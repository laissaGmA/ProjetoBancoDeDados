package com.example.oracle_db_project.model;

public enum Status {
    TESTADO(1, "Testado"),
    NAO_TESTADO(0, "Não Testado");

    private final int code;
    private final String description;

    Status(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    // Método para encontrar o enum pelo código
    public static Status fromCode(int code) {
        for (Status status : Status.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Código de status inválido: " + code);
    }
}

