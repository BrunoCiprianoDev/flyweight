package org.example.padrao;

import java.util.HashMap;
import java.util.Map;

public class LocalFactory {
    private static Map<String, Local> locais = new HashMap<>();

    public static Local getLocal(String uuid, String secao) {
        Local local = locais.get(uuid);
        if(local == null) {
            local = new Local(uuid, secao);
            locais.put(uuid, local);
        }
        return local;
    }

    public static int getTotalLocais() {
        return locais.size();
    }
}
