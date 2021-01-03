package com.zhouhc.eachPattern.flyweight.stand;

/**
 * 享用对象，有些对象是可以共享，所以可以抽象出来
 * ，形成共享的对象，共享对象要求对象力度细并且性质相似
 */
public class SignInfo {
    //报名人员id
    private String id;
    //考试地点
    private String location;
    //考试科目
    private String subject;
    //邮寄地址
    private String postAddress;
    //关键key值
    private String key;

    /**
     * 内部状态:
     * 对象可以共享的信息，存储在对象内部并且不会
     * 随着环境改变而改变。比如例子中的id,postAddress
     * subject,postAddress,location
     * 这些就可以作为动态附加信息，共享出去。
     * <p>
     * <p>
     * 外部状态:
     * 外部状态对象可以依赖的一种标识,随着环境的改变而改变，
     * 是不可以共享的状态。比如例子中的key就是用subject+location
     * 复合字段作为外部状态的, 是一个对象的唯一索引值。
     */

    //用外部状态标识一个对象，进而获取对象池中共享的对象
    public SignInfo(String key) {
        this.key = key;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }
}
