package com.zhouhc.eachPattern.command.ori;


import com.zhouhc.eachPattern.command.comm.CodePage;
import com.zhouhc.eachPattern.command.comm.InterfaceGroup;
import com.zhouhc.eachPattern.command.comm.PageGroup;
import com.zhouhc.eachPattern.command.comm.RequireGroup;

/**
 * 客户端
 */
public class OriClient {
    public static void main(String[] args) {
        //客户找需求组，页面组，代码组
        InterfaceGroup requireGroup = new RequireGroup();
        requireGroup.find();
        requireGroup.add();
        requireGroup.plan();
        System.out.println("");
        InterfaceGroup pageGroup = new PageGroup();
        pageGroup.find();
        pageGroup.add();
        pageGroup.plan();
        System.out.println("");
        InterfaceGroup codeGroup = new CodePage();
        codeGroup.find();
        codeGroup.add();
        codeGroup.plan();
        System.out.println("");
    }
}
