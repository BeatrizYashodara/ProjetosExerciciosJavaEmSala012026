package br.com.fatecpg;

import io.javalin.http.Context;
import java.time.LocalDateTime;
import java.util.Map;

public class TimeController {
    public void getNow(Context ctx)
    {
        LocalDateTime dataHoraAtual = LocalDateTime.now();

        Map<String, Object> respostaJson = Map.of
        (
            "timestamp", dataHoraAtual.toString(),
            "data", dataHoraAtual.toLocalDate().toString(),
            "hora", dataHoraAtual.toLocalTime().toString()
        );

        ctx.json(respostaJson);
    }
}
