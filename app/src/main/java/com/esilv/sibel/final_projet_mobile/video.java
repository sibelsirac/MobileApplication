package com.esilv.sibel.final_projet_mobile;

/**
 * Created by sibel on 17/03/2017.
 */

public class video {
private String kind;
    private String etag;
    private String nextPageToken;
    private String prevPageToken;
    private String regionCode;
    private PageInfo pageInfo;
    private Videos items;

    public video() {
    }


    public String getkind() {
        return  kind;
    }

    public void setkind( String kind) {
        this.kind = kind;
    }

    public String getetag() {
        return etag;
    }

    public void setetag(String etag) {
        this.etag = etag;
    }

    public String getnextPageToken() {
        return nextPageToken;
    }

    public void setnextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    public String getregionCode() {
        return regionCode;
    }

    public void setregionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getprevPageToken() {
        return prevPageToken;
    }

    public void setprevPageToken(String prevPageToken) {
        this.prevPageToken = prevPageToken;
    }

    public PageInfo getpageInfo() {
        return pageInfo;
    }

    public void setPosition(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public Videos getitems() {
        return items;
    }

    public void setitems(Videos items) {
        this.items = items;
    }



    public class PageInfo {

        private int totalResults;
        private int resultsPerPage;
        public int gettotalResults() {
            return totalResults;
        }

        public void settotalResults(int lat) {
            this.totalResults = totalResults;
        }

        public int getresultsPerPage() {
            return resultsPerPage;
        }

        public void setresultsPerPage(int resultsPerPage) {
            this.resultsPerPage = resultsPerPage;
        }
    }


    public class ID {
        private String kind ;
        private String videoid;

        public String getkind() {
            return kind;
        }

        public void setEtag(String kind) {
            this.kind = kind;
        }

        public String getId() {
            return videoid;
        }

        public void setId(String videoid) {
            this.videoid = videoid;
        }
    }

}
