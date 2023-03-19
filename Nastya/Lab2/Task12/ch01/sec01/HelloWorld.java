package ch01.sec01;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}

// <javac HelloWorld.java> копилируя файл из папки Task12, мы получаем файл класса в этой же папке
// <java HelloWorld> мы пытаемся выполнить файл класса, но происходит ошибка, так как указанные пакеты файла HelloWorld.java неверны - ch01.sec01 (правильно Lab2.Task12)
// <javac -d . HelloWorld.java> компилируем файл и получаем файл класса в указанные в файле пакеты, т.е. в ch01.sec01 (текущ.каталог/ch01/sec01)