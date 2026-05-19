package br.com.fatecpg;

import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        var app = Javalin.create().start(7070); 
        System.out.println("Servidor rodando em http://localhost:7070");
        // Rota / (raiz)

        app.get("/", ctx -> {
            ctx.result("Hello World, Javalin!");
        });

        // rota /now
        TimeController timeController = new TimeController();
        app.get("/now", timeController::getNow);
    }
}