package codeBlock;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie tom = new Movie("tom");
        Movie tom1 = new Movie("tom", "jack");

    }
}
class Movie{
    private String name;
    private double price;
    private String director;
    {
        System.out.println("你好");
    };
    public Movie(String director) {
        this.director = director;
        System.out.println("111");
    }

    public Movie(String name, String director) {
        this.name = name;
        this.director = director;
        System.out.println("222");
    }
}