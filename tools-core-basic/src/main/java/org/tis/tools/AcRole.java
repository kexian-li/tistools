package org.tis.tools;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Model class of 权限集(角色).
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class AcRole implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 数据主键. */
	private String guid;

	/** 隶属应用GUID. */
	private String guidApp;

	/** 角色代码. */
	private String roleCode;

	/** 角色名称. */
	private String roleName;

	/** 角色类别. */
	private String roleType;

	/** 角色描述. */
	private String roleDesc;

	/** The set of 操作员与权限集（角色）对应关系. */
	private Set<AcOperatorRole> acOperatorRoleSet;

	/** The set of 组织对象与角色对应关系. */
	private Set<AcPartyRole> acPartyRoleSet;

	/** The set of 角色数据范围权限对应. */
	private Set<AcRoleDatascope> acRoleDatascopeSet;

	/** The set of 角色实体关系. */
	private Set<AcRoleEntity> acRoleEntitySet;

	/** The set of 角色与实体属性关系. */
	private Set<AcRoleEntityfield> acRoleEntityfieldSet;

	/** The set of 权限集(角色)功能对应关系. */
	private Set<AcRoleFunc> acRoleFuncSet;

	/**
	 * Constructor.
	 */
	public AcRole() {
		this.acOperatorRoleSet = new HashSet<AcOperatorRole>();
		this.acPartyRoleSet = new HashSet<AcPartyRole>();
		this.acRoleDatascopeSet = new HashSet<AcRoleDatascope>();
		this.acRoleEntitySet = new HashSet<AcRoleEntity>();
		this.acRoleEntityfieldSet = new HashSet<AcRoleEntityfield>();
		this.acRoleFuncSet = new HashSet<AcRoleFunc>();
	}

	/**
	 * Set the 数据主键.
	 * 
	 * @param guid
	 *            数据主键
	 */
	public void setGuid(String guid) {
		this.guid = guid;
	}

	/**
	 * Get the 数据主键.
	 * 
	 * @return 数据主键
	 */
	public String getGuid() {
		return this.guid;
	}

	/**
	 * Set the 隶属应用GUID.
	 * 
	 * @param guidApp
	 *            隶属应用GUID
	 */
	public void setGuidApp(String guidApp) {
		this.guidApp = guidApp;
	}

	/**
	 * Get the 隶属应用GUID.
	 * 
	 * @return 隶属应用GUID
	 */
	public String getGuidApp() {
		return this.guidApp;
	}

	/**
	 * Set the 角色代码.
	 * 
	 * @param roleCode
	 *            角色代码
	 */
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	/**
	 * Get the 角色代码.
	 * 
	 * @return 角色代码
	 */
	public String getRoleCode() {
		return this.roleCode;
	}

	/**
	 * Set the 角色名称.
	 * 
	 * @param roleName
	 *            角色名称
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * Get the 角色名称.
	 * 
	 * @return 角色名称
	 */
	public String getRoleName() {
		return this.roleName;
	}

	/**
	 * Set the 角色类别.
	 * 
	 * @param roleType
	 *            角色类别
	 */
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	/**
	 * Get the 角色类别.
	 * 
	 * @return 角色类别
	 */
	public String getRoleType() {
		return this.roleType;
	}

	/**
	 * Set the 角色描述.
	 * 
	 * @param roleDesc
	 *            角色描述
	 */
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	/**
	 * Get the 角色描述.
	 * 
	 * @return 角色描述
	 */
	public String getRoleDesc() {
		return this.roleDesc;
	}

	/**
	 * Set the set of the 操作员与权限集（角色）对应关系.
	 * 
	 * @param acOperatorRoleSet
	 *            The set of 操作员与权限集（角色）对应关系
	 */
	public void setAcOperatorRoleSet(Set<AcOperatorRole> acOperatorRoleSet) {
		this.acOperatorRoleSet = acOperatorRoleSet;
	}

	/**
	 * Add the 操作员与权限集（角色）对应关系.
	 * 
	 * @param acOperatorRole
	 *            操作员与权限集（角色）对应关系
	 */
	public void addAcOperatorRole(AcOperatorRole acOperatorRole) {
		this.acOperatorRoleSet.add(acOperatorRole);
	}

	/**
	 * Get the set of the 操作员与权限集（角色）对应关系.
	 * 
	 * @return The set of 操作员与权限集（角色）对应关系
	 */
	public Set<AcOperatorRole> getAcOperatorRoleSet() {
		return this.acOperatorRoleSet;
	}

	/**
	 * Set the set of the 组织对象与角色对应关系.
	 * 
	 * @param acPartyRoleSet
	 *            The set of 组织对象与角色对应关系
	 */
	public void setAcPartyRoleSet(Set<AcPartyRole> acPartyRoleSet) {
		this.acPartyRoleSet = acPartyRoleSet;
	}

	/**
	 * Add the 组织对象与角色对应关系.
	 * 
	 * @param acPartyRole
	 *            组织对象与角色对应关系
	 */
	public void addAcPartyRole(AcPartyRole acPartyRole) {
		this.acPartyRoleSet.add(acPartyRole);
	}

	/**
	 * Get the set of the 组织对象与角色对应关系.
	 * 
	 * @return The set of 组织对象与角色对应关系
	 */
	public Set<AcPartyRole> getAcPartyRoleSet() {
		return this.acPartyRoleSet;
	}

	/**
	 * Set the set of the 角色数据范围权限对应.
	 * 
	 * @param acRoleDatascopeSet
	 *            The set of 角色数据范围权限对应
	 */
	public void setAcRoleDatascopeSet(Set<AcRoleDatascope> acRoleDatascopeSet) {
		this.acRoleDatascopeSet = acRoleDatascopeSet;
	}

	/**
	 * Add the 角色数据范围权限对应.
	 * 
	 * @param acRoleDatascope
	 *            角色数据范围权限对应
	 */
	public void addAcRoleDatascope(AcRoleDatascope acRoleDatascope) {
		this.acRoleDatascopeSet.add(acRoleDatascope);
	}

	/**
	 * Get the set of the 角色数据范围权限对应.
	 * 
	 * @return The set of 角色数据范围权限对应
	 */
	public Set<AcRoleDatascope> getAcRoleDatascopeSet() {
		return this.acRoleDatascopeSet;
	}

	/**
	 * Set the set of the 角色实体关系.
	 * 
	 * @param acRoleEntitySet
	 *            The set of 角色实体关系
	 */
	public void setAcRoleEntitySet(Set<AcRoleEntity> acRoleEntitySet) {
		this.acRoleEntitySet = acRoleEntitySet;
	}

	/**
	 * Add the 角色实体关系.
	 * 
	 * @param acRoleEntity
	 *            角色实体关系
	 */
	public void addAcRoleEntity(AcRoleEntity acRoleEntity) {
		this.acRoleEntitySet.add(acRoleEntity);
	}

	/**
	 * Get the set of the 角色实体关系.
	 * 
	 * @return The set of 角色实体关系
	 */
	public Set<AcRoleEntity> getAcRoleEntitySet() {
		return this.acRoleEntitySet;
	}

	/**
	 * Set the set of the 角色与实体属性关系.
	 * 
	 * @param acRoleEntityfieldSet
	 *            The set of 角色与实体属性关系
	 */
	public void setAcRoleEntityfieldSet(Set<AcRoleEntityfield> acRoleEntityfieldSet) {
		this.acRoleEntityfieldSet = acRoleEntityfieldSet;
	}

	/**
	 * Add the 角色与实体属性关系.
	 * 
	 * @param acRoleEntityfield
	 *            角色与实体属性关系
	 */
	public void addAcRoleEntityfield(AcRoleEntityfield acRoleEntityfield) {
		this.acRoleEntityfieldSet.add(acRoleEntityfield);
	}

	/**
	 * Get the set of the 角色与实体属性关系.
	 * 
	 * @return The set of 角色与实体属性关系
	 */
	public Set<AcRoleEntityfield> getAcRoleEntityfieldSet() {
		return this.acRoleEntityfieldSet;
	}

	/**
	 * Set the set of the 权限集(角色)功能对应关系.
	 * 
	 * @param acRoleFuncSet
	 *            The set of 权限集(角色)功能对应关系
	 */
	public void setAcRoleFuncSet(Set<AcRoleFunc> acRoleFuncSet) {
		this.acRoleFuncSet = acRoleFuncSet;
	}

	/**
	 * Add the 权限集(角色)功能对应关系.
	 * 
	 * @param acRoleFunc
	 *            权限集(角色)功能对应关系
	 */
	public void addAcRoleFunc(AcRoleFunc acRoleFunc) {
		this.acRoleFuncSet.add(acRoleFunc);
	}

	/**
	 * Get the set of the 权限集(角色)功能对应关系.
	 * 
	 * @return The set of 权限集(角色)功能对应关系
	 */
	public Set<AcRoleFunc> getAcRoleFuncSet() {
		return this.acRoleFuncSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((guid == null) ? 0 : guid.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		AcRole other = (AcRole) obj;
		if (guid == null) {
			if (other.guid != null) {
				return false;
			}
		} else if (!guid.equals(other.guid)) {
			return false;
		}
		return true;
	}

}
