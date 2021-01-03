package com.zhouhc.eachPattern.Iterator.ori;

import com.zhouhc.eachPattern.Iterator.comm.ConcreteIProject;
import com.zhouhc.eachPattern.Iterator.comm.IProject;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现类
 */
public class OriClient {

    public static void main(String[] args) {
        List<IProject> iProjectList = new ArrayList<IProject>();

        for (int i = 0; i < 5; i++)
            iProjectList.add(new ConcreteIProject(i + 1, "项目" + i, (i + 1) * 1000));

        iProjectList.iterator();
        for(IProject iProject : iProjectList)
            System.out.println(iProject.getProject());
    }
}
