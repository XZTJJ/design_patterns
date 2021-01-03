package com.zhouhc.eachPattern.bridge.stand;



public class Client {
    public static void main(String[] args) {
        System.out.println("房地产公司是这样运行的...");
        Corp houseCorp = new HouseCorp(new House());
        houseCorp.makeMoney();
        System.out.println("");

        System.out.println("山寨公司是这样运行的...");
        Corp sanzhai = new ShanZhaiCorp(new IPod());
        sanzhai.makeMoney();
        System.out.println("");
    }
}
