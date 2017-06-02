package org.tis.tools;

import java.io.Serializable;

/**
 * Model class of 序号资源表.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class SysSeqno implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 序号键值. */
	private String seqKey;

	/** 序号数. */
	private Integer seqNo;

	/** 重置方式. */
	private String reset;

	/** 重置处理参数. */
	private String resetParams;

	/**
	 * Constructor.
	 */
	public SysSeqno() {
	}

	/**
	 * Set the 序号键值.
	 * 
	 * @param seqKey
	 *            序号键值
	 */
	public void setSeqKey(String seqKey) {
		this.seqKey = seqKey;
	}

	/**
	 * Get the 序号键值.
	 * 
	 * @return 序号键值
	 */
	public String getSeqKey() {
		return this.seqKey;
	}

	/**
	 * Set the 序号数.
	 * 
	 * @param seqNo
	 *            序号数
	 */
	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}

	/**
	 * Get the 序号数.
	 * 
	 * @return 序号数
	 */
	public Integer getSeqNo() {
		return this.seqNo;
	}

	/**
	 * Set the 重置方式.
	 * 
	 * @param reset
	 *            重置方式
	 */
	public void setReset(String reset) {
		this.reset = reset;
	}

	/**
	 * Get the 重置方式.
	 * 
	 * @return 重置方式
	 */
	public String getReset() {
		return this.reset;
	}

	/**
	 * Set the 重置处理参数.
	 * 
	 * @param resetParams
	 *            重置处理参数
	 */
	public void setResetParams(String resetParams) {
		this.resetParams = resetParams;
	}

	/**
	 * Get the 重置处理参数.
	 * 
	 * @return 重置处理参数
	 */
	public String getResetParams() {
		return this.resetParams;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((seqKey == null) ? 0 : seqKey.hashCode());
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
		SysSeqno other = (SysSeqno) obj;
		if (seqKey == null) {
			if (other.seqKey != null) {
				return false;
			}
		} else if (!seqKey.equals(other.seqKey)) {
			return false;
		}
		return true;
	}

}