package com.wise;

import java.util.HashSet;
import java.util.Set;

public class DFAUtilsTest {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("大中华");
        set.add("大中华帝国");
        set.add("大汉民族");
        set.add("日本人");
        set.add("日本鬼子");

        DFAUtil dfa = new DFAUtil();
        dfa.createDFAHashMap(set);

        Set<String> result = dfa.getSensitiveWordByDFAMap("大中华帝国和日本人", 2);
        System.out.println("敏感词有" + result.size() + "个");
        for (String string : result) {
            System.out.println("违背敏感词：" + string);
        }

    }
}
