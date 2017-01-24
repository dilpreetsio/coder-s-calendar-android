package in.codebros.entity;

import java.util.Date;

public class Data 
{
    
    String name,company,imageIcon,status,type,url;
    Date start,end;

    //  name = name of the contest
    //  company = site
    //  imageIcon = icon image name
    //  start = time the contest started
    //  end = time the contest will end
    //  status = contains the status of the contest i.e live or upcoming
    //  type = hackathon/contest
    //  url = the url of the contest
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public String getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(String imageIcon) {
        this.imageIcon = imageIcon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
