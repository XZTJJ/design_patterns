package com.zhouhc.eachPattern.Iterator.stand;

import com.zhouhc.eachPattern.Iterator.comm.ConcreteIProject;
import com.zhouhc.eachPattern.Iterator.comm.ConcreteIProjectIterator;
import com.zhouhc.eachPattern.Iterator.comm.IProject;
import com.zhouhc.eachPattern.Iterator.comm.IProjectIterator;

;

/**
 * 客户端模式
 */
public class StandClient {
    public static void main(String[] args) {

        IProject iProject = new ConcreteIProject();

        for (int i = 0; i < 5; i++)
            iProject.add(i + 1, "项目" + i, (i + 1) * 1000);

        IProjectIterator iProjectIProjectIterator = iProject.getInterrator();
        while (iProjectIProjectIterator.hasNext()) {
            System.out.println(((IProject)iProjectIProjectIterator.next()).getProject());
        }
    }
}
