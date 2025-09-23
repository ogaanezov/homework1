package api;

public class ColorsData {
    private Integer id;
    private String name;
    private Integer year;
    private String color;
    private String pantone_value;

    public ColorsData(Integer id, String name, Integer year, String pantone_value, String color) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.pantone_value = pantone_value;
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    public String getPantone_value() {
        return pantone_value;
    }

    public String getColor() {
        return color;
    }
}
