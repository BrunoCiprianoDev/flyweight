package org.example.padrao;

public class Local {

    private String uuid;
    private String secao;

    public Local(String uuid, String secao) {
        this.uuid = uuid;
        this.secao = secao;
    }

    public String getUuid() {
        return uuid;
    }

    public String getSecao() {
        return secao;
    }

    @Override
    public String toString() {
        return "Local{" +
                "uuid='" + uuid + '\'' +
                ", secao='" + secao + '\'' +
                '}';
    }
}
