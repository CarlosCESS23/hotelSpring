package main.model;

import java.math.BigDecimal;

public class Hotel {

    private Long hotid;
    private String hotnome;
    private String hotcidade;
    private BigDecimal hotvalordiaria;
    private int hotestrelas;
    private boolean hotdisponivel;

    public Hotel(){

    }

    public Hotel(Long hotid, String hotnome,String hotcidade, BigDecimal hotvalordiaria, int hotestrelas, boolean hotdisponivel) {
        this.hotid = hotid;
        this.hotnome = hotnome;
        this.hotcidade = hotcidade;
        this.hotvalordiaria = hotvalordiaria;
        this.hotestrelas = hotestrelas;
        this.hotdisponivel = hotdisponivel;
    }

    public Long getHotid() {
        return hotid;
    }

    public void setHotid(Long hotid) {
        this.hotid = hotid;
    }

    public String getHotcidade() {
        return hotcidade;
    }

    public void setHotcidade(String hotcidade) {
        this.hotcidade = hotcidade;
    }

    public BigDecimal getHotvalordiaria() {
        return hotvalordiaria;
    }

    public void setHotvalordiaria(BigDecimal hotvalordiaria) {
        this.hotvalordiaria = hotvalordiaria;
    }

    public int getHotestrelas() {
        return hotestrelas;
    }

    public void setHotestrelas(int hotestrelas) {
        this.hotestrelas = hotestrelas;
    }

    public boolean isHotdisponivel() {
        return hotdisponivel;
    }

    public void setHotdisponivel(boolean hotdisponivel) {
        this.hotdisponivel = hotdisponivel;
    }

    public String getHotnome() {
        return hotnome;
    }

    public void setHotnome(String hotnome) {
        this.hotnome = hotnome;
    }
}
