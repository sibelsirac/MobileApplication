package com.esilv.sibel.final_projet_mobile;

import java.io.Serializable;

/**
 * Created by sibel on 17/03/2017.
 */

public class Item implements Serializable {
    private String etag;
    private video.ID id;


    public String getEtag() {
        return etag;
    }

    public void setEtag(String Etag) {
        this.etag = Etag;
    }

    public video.ID getId() {
        return id;
    }

    public void setId(video.ID id) {
        this.id = id;
    }
}




