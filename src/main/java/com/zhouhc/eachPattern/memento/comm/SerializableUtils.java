package com.zhouhc.eachPattern.memento.comm;


import com.zhouhc.eachPattern.memento.stand.StandMemento;

import java.io.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 序列化的工具
 *
 * 与设计模式无关，突发奇想的
 */
public class SerializableUtils implements Cloneable{
    //序列化
    public static byte[] serializable(Object t) throws IOException {
        if (null == t)
            return null;
        ByteArrayOutputStream arrayOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        byte[] byteArrays = null;
        try {
            arrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(arrayOutputStream);
            objectOutputStream.writeObject(t);
            objectOutputStream.flush();
            byteArrays = arrayOutputStream.toByteArray();
        } finally {
            if (objectOutputStream != null)
                objectOutputStream.close();
            if (arrayOutputStream != null)
                arrayOutputStream.close();
        }
        return byteArrays;
    }

    //反序列化
    public static Object unSerializable(byte[] byteArrays) throws IOException, ClassNotFoundException {
        if (byteArrays == null)
            return null;

        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;
        Object o = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(byteArrays);
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            o = objectInputStream.readObject();
        } finally {
            if (objectInputStream != null)
                objectInputStream.close();
            if (byteArrayInputStream != null)
                byteArrayInputStream.close();
        }

        return o;
    }

    public static void main(String[] args) throws Exception {

        List<String> strings = Arrays.asList("高兴", "紧张", "激动");
        byte[] serializable = serializable(strings);
        List<String> cloneList = (List<String>)unSerializable(serializable);
        System.out.println(cloneList);
    }
}
