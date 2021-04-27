public class Homework01{
    //1 输出hello world
    // public static void main(String[] args){
    // System.out.println("Hello,world!");
    // }

    //2 分行输出个人信息，转义字符使用
    public static void main(String[] args){
    System.out.println("姓名\t性别\t籍贯\t住址\n高尚欣\t男\t河南\t陕西");
    }

    //3 JDK,JRE,JVM关系：
    //JDK = JRE + java开发工具
    //JRE = JVM + java核心类库

    //4 环境变量path作用及配置：
    //path能够在操作系统任意目录调用javac、java指令
    //配置：1 设置变量JAVA_HOME = 指向jdk安装的bin目录
    //		2 环境变量增加%JAVA_HOME%\bin

    //5 java编写步骤：
    //1 编写源文件 .java
    //2 javac编译获得对应 .class文件
    //3 java运行，即将.class加载到JVM

    //6 java编写规范：
    //1 类和方法使用文档注释(javadoc)
    //2 单/多行注释用于给代码进行解释说明
    //3 tab右移，shift+tab左移
    //4 计算符号左右留空格
    //5 源码使用utf-8编码
    //6 行宽不超80
    //7 代码编写：次行风格、行尾风格

    //7 易犯错误：
    //1 目录错误
    //2 主类名与文件名不一致
    //3 缺少分号
    //4 拼写错误

}