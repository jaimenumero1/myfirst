package LaptopFolder;

public class OS {

    private String nameOs;
    private String osVersion;

    @Override
    public String toString() {
        return "OS{" +
                "nameOs='" + nameOs + '\'' +
                ", osVersion='" + osVersion + '\'' +
                '}';
    }

    public OS(String nameOs, String osVersion) {
        this.nameOs = nameOs;
        this.osVersion = osVersion;
    }

    public String getNameOs() {
        return nameOs;
    }

    public void setNameOs(String nameOs) {
        this.nameOs = nameOs;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }
}
