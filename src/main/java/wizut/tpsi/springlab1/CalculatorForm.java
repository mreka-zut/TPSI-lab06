package wizut.tpsi.springlab1;

public class CalculatorForm {
    private Integer x;
    private Integer y;
    private String method;

    public CalculatorForm(Integer x, Integer y, String method) {
        this.x = x;
        this.y = y;
        this.method = method;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
