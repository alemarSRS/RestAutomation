package Resources;

public enum APIresources {

    ADDPLACEAPI("/maps/api/place/add/json"),
    GETPLACEAPI("/maps/api/place/get/json"),
    DELETEPLACEAPI("/maps/api/place/delete/json");
    private String resource;

    APIresources(String resource) {
        this.resource = resource;
    }

    public String getResource() {
        return resource;
    }
}
