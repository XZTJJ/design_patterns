package com.zhouhc.eachPattern.composite.ori;


import java.util.List;

/**
 * 原始测试类
 *
 * 按照公司的职位打印对应信息
 */
public class OriClient {

    public static void main(String[] args) {
        //最高层
        OriRoot wangdamazi = new OriRoot("总经理   ","王大麻子",100000);
        //下面一级的领导
        OriBranch liudaquezi = new OriBranch("研发部经理 " ,"刘大瘸子",20000);
        //小组长yangsanyexie
        OriBranch yangsanyexie = new OriBranch("研发一组组长","杨三也斜",8000);
        //开发人员
        OriLeaf oriLeafA = new OriLeaf("开发人员  ","员工A",6000);
        OriLeaf oriLeafB = new OriLeaf("开发人员  ","员工B",5000);
        OriLeaf oriLeafC = new OriLeaf("开发人员  ","员工C",4000);
        yangsanyexie.addSubordinate(oriLeafA);
        yangsanyexie.addSubordinate(oriLeafB);
        yangsanyexie.addSubordinate(oriLeafC);
        //小组长wudabangchui
        OriBranch wudabangchui = new OriBranch("研发二组组长","吴大棒槌",9000);
        //开发人员
        OriLeaf oriLeafD = new OriLeaf("开发人员  ","员工D",6000);
        OriLeaf oriLeafE = new OriLeaf("开发人员  ","员工E",5000);
        OriLeaf oriLeafF = new OriLeaf("开发人员  ","员工F",4000);
        wudabangchui.addSubordinate(oriLeafD);
        wudabangchui.addSubordinate(oriLeafE);
        wudabangchui.addSubordinate(oriLeafF);
        //小组长zhenglaoliu
        OriBranch zhenglaoliu = new OriBranch("研发部副经理","郑老六",15000);
        liudaquezi.addSubordinate(yangsanyexie);
        liudaquezi.addSubordinate(wudabangchui);
        liudaquezi.addSubordinate(zhenglaoliu);
        //下面一级的领导
        OriBranch maerguazi = new OriBranch("销售部经理 ","马二拐子",25000);
        //销售人员
        OriLeaf oriLeafH = new OriLeaf("销售人员  ","员工H",7000);
        OriLeaf oriLeafI = new OriLeaf("销售人员  ","员工I",7500);
        maerguazi.addSubordinate(oriLeafH);
        maerguazi.addSubordinate(oriLeafI);
        //下面一级的领导
        OriBranch zhengsantuozi = new OriBranch("财务部经理 ","郑三驼子",20000);
        //财务人员
        OriLeaf oriLeafJ = new OriLeaf("财务人员  ","员工J",7000);
        zhengsantuozi.addSubordinate(oriLeafJ);
        //秘书
        OriLeaf oriLeafK = new OriLeaf("秘书    ","员工K",8000);
        wangdamazi.addSubordinate(liudaquezi);
        wangdamazi.addSubordinate(maerguazi);
        wangdamazi.addSubordinate(zhengsantuozi);
        wangdamazi.addSubordinate(oriLeafK);
        //打印
        System.out.println(wangdamazi.getInfo());
        getAllSubordinate(wangdamazi.getOriSubordinate());
    }

    public static void getAllSubordinate(List oriSubordinate){
        for(Object sb : oriSubordinate){
            if(sb instanceof OriBranch) {
                System.out.println(((OriBranch)sb).getInfo());
                getAllSubordinate(((OriBranch) sb).getOriSubordinate());
            }
            else
                System.out.println(((OriLeaf)sb).getInfo());
        }
    }

}
