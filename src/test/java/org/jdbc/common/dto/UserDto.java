package org.jdbc.common.dto;

import java.io.Serializable;
import java.util.Date;

import org.jdbc.common.base.DbColumn;
import org.jdbc.common.base.DbColumn.ColumType;
import org.jdbc.common.base.DbTable;

@DbTable("sys_user")
public class UserDto implements Serializable {

    /**
     * 用户信息
     */
    private static final long serialVersionUID = 4100310788962936416L;

    @DbColumn(key = true)
    private String id;
    
    @DbColumn("username") //与数据库字段不同需要注解说明
    private String userName;

    private Date created;

    private Integer state;

    private Integer sex;

    //-----非本数据库的额外字段------
    @DbColumn(type = ColumType.QUERY_ONLY) //只允许查询不允许写入，如 left join 时使用
    private String roleid;

    @DbColumn(type = ColumType.IGNORE) //直接忽略，不查不写
    private String flag;

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getFlag() {
        return flag;
    }

 

    public void setFlag(String flag) {

        this.flag = flag;

    }

 

    public String getId() {

        return id;

    }

 

    public void setId(String id) {

        this.id = id;

    }

 

    public String getUserName() {

        return userName;

    }

 

    public void setUserName(String userName) {

        this.userName = userName;

    }

 

    public Date getCreated() {

        return created;

    }

 

    public void setCreated(Date created) {

        this.created = created;

    }

 

    public Integer getState() {

        return state;

    }

 

    public void setState(Integer state) {

        this.state = state;

    }

 

    public Integer getSex() {

        return sex;

    }

 

    public void setSex(Integer sex) {

        this.sex = sex;

    }

 

}

 

 
