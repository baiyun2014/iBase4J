package org.ibase4j.model.generator;

import org.ibase4j.core.base.BaseModel;

@SuppressWarnings("serial")
public class SysMenu extends BaseModel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.menu_name
     *
     * @mbggenerated
     */
    private String menuName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.menu_type
     *
     * @mbggenerated
     */
    private Boolean menuType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.parent_id
     *
     * @mbggenerated
     */
    private String parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.iconcls_
     *
     * @mbggenerated
     */
    private String iconcls;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.request_
     *
     * @mbggenerated
     */
    private String request;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.expand_
     *
     * @mbggenerated
     */
    private Boolean expand;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.sort_no
     *
     * @mbggenerated
     */
    private Integer sortNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.is_show
     *
     * @mbggenerated
     */
    private Boolean isShow;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.permission_
     *
     * @mbggenerated
     */
    private String permission;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.menu_name
     *
     * @return the value of sys_menu.menu_name
     *
     * @mbggenerated
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.menu_name
     *
     * @param menuName the value for sys_menu.menu_name
     *
     * @mbggenerated
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.menu_type
     *
     * @return the value of sys_menu.menu_type
     *
     * @mbggenerated
     */
    public Boolean getMenuType() {
        return menuType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.menu_type
     *
     * @param menuType the value for sys_menu.menu_type
     *
     * @mbggenerated
     */
    public void setMenuType(Boolean menuType) {
        this.menuType = menuType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.parent_id
     *
     * @return the value of sys_menu.parent_id
     *
     * @mbggenerated
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.parent_id
     *
     * @param parentId the value for sys_menu.parent_id
     *
     * @mbggenerated
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.iconcls_
     *
     * @return the value of sys_menu.iconcls_
     *
     * @mbggenerated
     */
    public String getIconcls() {
        return iconcls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.iconcls_
     *
     * @param iconcls the value for sys_menu.iconcls_
     *
     * @mbggenerated
     */
    public void setIconcls(String iconcls) {
        this.iconcls = iconcls == null ? null : iconcls.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.request_
     *
     * @return the value of sys_menu.request_
     *
     * @mbggenerated
     */
    public String getRequest() {
        return request;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.request_
     *
     * @param request the value for sys_menu.request_
     *
     * @mbggenerated
     */
    public void setRequest(String request) {
        this.request = request == null ? null : request.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.expand_
     *
     * @return the value of sys_menu.expand_
     *
     * @mbggenerated
     */
    public Boolean getExpand() {
        return expand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.expand_
     *
     * @param expand the value for sys_menu.expand_
     *
     * @mbggenerated
     */
    public void setExpand(Boolean expand) {
        this.expand = expand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.sort_no
     *
     * @return the value of sys_menu.sort_no
     *
     * @mbggenerated
     */
    public Integer getSortNo() {
        return sortNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.sort_no
     *
     * @param sortNo the value for sys_menu.sort_no
     *
     * @mbggenerated
     */
    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.is_show
     *
     * @return the value of sys_menu.is_show
     *
     * @mbggenerated
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.is_show
     *
     * @param isShow the value for sys_menu.is_show
     *
     * @mbggenerated
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.permission_
     *
     * @return the value of sys_menu.permission_
     *
     * @mbggenerated
     */
    public String getPermission() {
        return permission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.permission_
     *
     * @param permission the value for sys_menu.permission_
     *
     * @mbggenerated
     */
    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", menuName=").append(menuName);
        sb.append(", menuType=").append(menuType);
        sb.append(", parentId=").append(parentId);
        sb.append(", iconcls=").append(iconcls);
        sb.append(", request=").append(request);
        sb.append(", expand=").append(expand);
        sb.append(", sortNo=").append(sortNo);
        sb.append(", isShow=").append(isShow);
        sb.append(", permission=").append(permission);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysMenu other = (SysMenu) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMenuName() == null ? other.getMenuName() == null : this.getMenuName().equals(other.getMenuName()))
            && (this.getMenuType() == null ? other.getMenuType() == null : this.getMenuType().equals(other.getMenuType()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getIconcls() == null ? other.getIconcls() == null : this.getIconcls().equals(other.getIconcls()))
            && (this.getRequest() == null ? other.getRequest() == null : this.getRequest().equals(other.getRequest()))
            && (this.getExpand() == null ? other.getExpand() == null : this.getExpand().equals(other.getExpand()))
            && (this.getSortNo() == null ? other.getSortNo() == null : this.getSortNo().equals(other.getSortNo()))
            && (this.getIsShow() == null ? other.getIsShow() == null : this.getIsShow().equals(other.getIsShow()))
            && (this.getPermission() == null ? other.getPermission() == null : this.getPermission().equals(other.getPermission()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMenuName() == null) ? 0 : getMenuName().hashCode());
        result = prime * result + ((getMenuType() == null) ? 0 : getMenuType().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getIconcls() == null) ? 0 : getIconcls().hashCode());
        result = prime * result + ((getRequest() == null) ? 0 : getRequest().hashCode());
        result = prime * result + ((getExpand() == null) ? 0 : getExpand().hashCode());
        result = prime * result + ((getSortNo() == null) ? 0 : getSortNo().hashCode());
        result = prime * result + ((getIsShow() == null) ? 0 : getIsShow().hashCode());
        result = prime * result + ((getPermission() == null) ? 0 : getPermission().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}