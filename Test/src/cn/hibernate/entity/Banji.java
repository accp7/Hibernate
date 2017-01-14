package cn.hibernate.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by 安 on 2017/1/13.
 */
@Entity
public class Banji {
    private Long sid;
    private String sname;
    private Long sage;

    @Id
    @Column(name = "SID", nullable = false, precision = 0)
    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "SNAME", nullable = true, length = 32)
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Basic
    @Column(name = "SAGE", nullable = true, precision = 0)
    public Long getSage() {
        return sage;
    }

    public void setSage(Long sage) {
        this.sage = sage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Banji banji = (Banji) o;

        if (sid != null ? !sid.equals(banji.sid) : banji.sid != null) return false;
        if (sname != null ? !sname.equals(banji.sname) : banji.sname != null) return false;
        if (sage != null ? !sage.equals(banji.sage) : banji.sage != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid != null ? sid.hashCode() : 0;
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        result = 31 * result + (sage != null ? sage.hashCode() : 0);
        return result;
    }
}
