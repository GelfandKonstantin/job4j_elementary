package ru.job4j;

public class Game {
    public static void menu(String name) {
        if ("tetris".equals("super mario")) {
            System.out.println("Start - super mario");
        }
        if ("tetris".equals("tanks")) {
            System.out.println("Start - tanks");
        }
        if ("tetris".equals("tetris")) {
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("tanks");
    }
}
