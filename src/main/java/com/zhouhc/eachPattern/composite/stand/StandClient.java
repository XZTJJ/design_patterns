package com.zhouhc.eachPattern.composite.stand;

/**
 * 高层的类
 */
public class StandClient {

    public static void main(String[] args) {
        StandEmployee lastest = standComposite();
        getAllEmployee(lastest);
    }

    public static void getAllEmployee(StandEmployee lastest) {
        System.out.println(lastest.getInfo());
        if (lastest instanceof StandBranch)
            for (StandEmployee employee : ((StandBranch) lastest).getSubordinate())
                getAllEmployee(employee);

    }

    public static StandEmployee standComposite() {
        //最高层
        StandEmployee wangdamazi = new StandBranch("总经理   ", "王大麻子", 100000);
        //下面一级的领导
        StandEmployee liudaquezi = new StandBranch("研发部经理 ", "刘大瘸子", 20000);
        //小组长yangsanyexie
        StandEmployee yangsanyexie = new StandBranch("研发一组组长", "杨三也斜", 8000);
        //开发人员
        StandLeaf oriLeafA = new StandLeaf("开发人员  ", "员工A", 6000);
        StandLeaf oriLeafB = new StandLeaf("开发人员  ", "员工B", 5000);
        StandLeaf oriLeafC = new StandLeaf("开发人员  ", "员工C", 4000);
        ((StandBranch) yangsanyexie).addSubordinate(oriLeafA);
        ((StandBranch) yangsanyexie).addSubordinate(oriLeafB);
        ((StandBranch) yangsanyexie).addSubordinate(oriLeafC);
        //小组长wudabangchui
        StandEmployee wudabangchui = new StandBranch("研发二组组长", "吴大棒槌", 9000);
        //开发人员
        StandLeaf oriLeafD = new StandLeaf("开发人员  ", "员工D", 6000);
        StandLeaf oriLeafE = new StandLeaf("开发人员  ", "员工E", 5000);
        StandLeaf oriLeafF = new StandLeaf("开发人员  ", "员工F", 4000);
        ((StandBranch) wudabangchui).addSubordinate(oriLeafD);
        ((StandBranch) wudabangchui).addSubordinate(oriLeafE);
        ((StandBranch) wudabangchui).addSubordinate(oriLeafF);
        //小组长zhenglaoliu
        StandEmployee zhenglaoliu = new StandBranch("研发部副经理", "郑老六", 15000);
        ((StandBranch) liudaquezi).addSubordinate(yangsanyexie);
        ((StandBranch) liudaquezi).addSubordinate(wudabangchui);
        ((StandBranch) liudaquezi).addSubordinate(zhenglaoliu);
        //下面一级的领导
        StandEmployee maerguazi = new StandBranch("销售部经理 ", "马二拐子", 25000);
        //销售人员
        StandLeaf oriLeafH = new StandLeaf("销售人员  ", "员工H", 7000);
        StandLeaf oriLeafI = new StandLeaf("销售人员  ", "员工I", 7500);
        ((StandBranch) maerguazi).addSubordinate(oriLeafH);
        ((StandBranch) maerguazi).addSubordinate(oriLeafI);
        //下面一级的领导
        StandEmployee zhengsantuozi = new StandBranch("财务部经理 ", "郑三驼子", 20000);
        //财务人员
        StandLeaf oriLeafJ = new StandLeaf("财务人员  ", "员工J", 7000);
        ((StandBranch) zhengsantuozi).addSubordinate(oriLeafJ);
        //秘书
        StandLeaf oriLeafK = new StandLeaf("秘书    ", "员工K", 8000);
        ((StandBranch) wangdamazi).addSubordinate(liudaquezi);
        ((StandBranch) wangdamazi).addSubordinate(maerguazi);
        ((StandBranch) wangdamazi).addSubordinate(zhengsantuozi);
        ((StandBranch) wangdamazi).addSubordinate(oriLeafK);
        return wangdamazi;
    }
}
