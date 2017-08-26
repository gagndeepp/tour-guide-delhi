package gagan.tourguideapp;


class Attraction {
    private Integer ImageRes;
    private String HeadingString;
    private String DescString;
    private String InfoString;

    Attraction(Integer ImageId, String[] string_info) {
        ImageRes = ImageId;
        HeadingString = string_info[0];
        DescString = string_info[1];
        InfoString = string_info[2];
    }

    Integer getImageRes() {
        return ImageRes;
    }

    String getHeadingString() {
        return HeadingString;
    }

    String getDescString() {
        return DescString;
    }

    String getInfoString() {
        return InfoString;
    }

}
