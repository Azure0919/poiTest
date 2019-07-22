package com.psx.domain;

public class Area {
	/**
	 * 区域id
	 */
	private String areaId;
	/*
	 * 省
	 */

	private String province;
	/**
	 * 市
	 */
	private String city;
	/**
	 * 县
	 */
	private String county;
	/**
	 * 邮编
	 */

	private String codePost;
	/**
	 * 简码省市区,最后一级不为空的数据的拼音首字母简码省市区,最后一级不为空的数据的拼音首字母
	 */
	private String briefCode;
	/**
	 * 城市编码,工作单录入时到达地录入简码
	 */
	private String cityCode;
	/**
	 * 进港单位id
	 */
	private String enterHarborId;
	/**
	 * 进港单位名
	 */
	private String enterHarborName;
	/**
	 * 出港单位id
	 */
	
	private String leaveHarborId;
	/**
	 * 出港单位名
	 */

	private String leaveHarborName;
	/**
	 * 服务区
	 */

	private String serviceArea;
	/**
	 * 不可服务区
	 */

	private String unServiceArea;
	/**
	 * 特殊区
	 */

	private String specialZone;
	/**
	 * 是否外网
	 */

	private int outsideNet;
	/**
	 * 是否郊区
	 */

	private int suburbanCounty;
	/**
	 * 区域级别:省级,市级,直辖市,县级,地级,省会
	 */

	private String gradeArea;
	/**
	 * 所属区域:东北区,华东区,华南区,西北区,华中区.西南区,华北区
	 */

	private String region;
	/**
	 * 所属城市级别:省级,县级,地级
	 */

	private String gradeCity;
	/**
	 * 海关口岸
	 */

	private String portArea;
	/**
	 * 是否可用
	 */

	private int userable;
	/**
	 * 描述
	 */
	private String description;

	public Area() {
		super();
	}

	public Area(String areaId, String province,
                String codePost, String briefCode,
                String cityCode, String enterHarborId,
                String leaveHarborId, int userable) {
		this.areaId = areaId;
		this.province = province;
		this.codePost = codePost;
		this.briefCode = briefCode;
		this.cityCode = cityCode;
		this.enterHarborId = enterHarborId;
		this.leaveHarborId = leaveHarborId;
		this.userable = userable;
	}

	public Area(String areaId, String province, String city, String county, String codePost, String briefCode,
                String cityCode, String enterHarborId, String enterHarborName, String leaveHarborId, String leaveHarborName,
                String serviceArea, String unServiceArea, String specialZone, int outsideNet, int suburbanCounty,
                String gradeArea, String region, String gradeCity, String portArea, int userable, String description) {
		super();
		this.areaId = areaId;
		this.province = province;
		this.city = city;
		this.county = county;
		this.codePost = codePost;
		this.briefCode = briefCode;
		this.cityCode = cityCode;
		this.enterHarborId = enterHarborId;
		this.enterHarborName = enterHarborName;
		this.leaveHarborId = leaveHarborId;
		this.leaveHarborName = leaveHarborName;
		this.serviceArea = serviceArea;
		this.unServiceArea = unServiceArea;
		this.specialZone = specialZone;
		this.outsideNet = outsideNet;
		this.suburbanCounty = suburbanCounty;
		this.gradeArea = gradeArea;
		this.region = region;
		this.gradeCity = gradeCity;
		this.portArea = portArea;
		this.userable = userable;
		this.description = description;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCodePost() {
		return codePost;
	}

	public void setCodePost(String codePost) {
		this.codePost = codePost;
	}

	public String getBriefCode() {
		return briefCode;
	}

	public void setBriefCode(String briefCode) {
		this.briefCode = briefCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getEnterHarborId() {
		return enterHarborId;
	}

	public void setEnterHarborId(String enterHarborId) {
		this.enterHarborId = enterHarborId;
	}

	public String getEnterHarborName() {
		return enterHarborName;
	}

	public void setEnterHarborName(String enterHarborName) {
		this.enterHarborName = enterHarborName;
	}

	public String getLeaveHarborId() {
		return leaveHarborId;
	}

	public void setLeaveHarborId(String leaveHarborId) {
		this.leaveHarborId = leaveHarborId;
	}

	public String getLeaveHarborName() {
		return leaveHarborName;
	}

	public void setLeaveHarborName(String leaveHarborName) {
		this.leaveHarborName = leaveHarborName;
	}

	public String getServiceArea() {
		return serviceArea;
	}

	public void setServiceArea(String serviceArea) {
		this.serviceArea = serviceArea;
	}

	public String getUnServiceArea() {
		return unServiceArea;
	}

	public void setUnServiceArea(String unServiceArea) {
		this.unServiceArea = unServiceArea;
	}

	public String getSpecialZone() {
		return specialZone;
	}

	public void setSpecialZone(String specialZone) {
		this.specialZone = specialZone;
	}

	public int getOutsideNet() {
		return outsideNet;
	}

	public void setOutsideNet(int outsideNet) {
		this.outsideNet = outsideNet;
	}

	public int getsuburbanCounty() {
		return suburbanCounty;
	}

	public void setsuburbanCounty(int suburbanCounty) {
		this.suburbanCounty = suburbanCounty;
	}

	public String getGradeArea() {
		return gradeArea;
	}

	public void setGradeArea(String gradeArea) {
		this.gradeArea = gradeArea;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getGradeCity() {
		return gradeCity;
	}

	public void setGradeCity(String gradeCity) {
		this.gradeCity = gradeCity;
	}

	public String getPortArea() {
		return portArea;
	}

	public void setPortArea(String portArea) {
		this.portArea = portArea;
	}

	public int getUserable() {
		return userable;
	}

	public void setUserable(int userable) {
		this.userable = userable;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((areaId == null) ? 0 : areaId.hashCode());
		result = prime * result + ((briefCode == null) ? 0 : briefCode.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((cityCode == null) ? 0 : cityCode.hashCode());
		result = prime * result + ((codePost == null) ? 0 : codePost.hashCode());
		result = prime * result + ((county == null) ? 0 : county.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((enterHarborId == null) ? 0 : enterHarborId.hashCode());
		result = prime * result + ((enterHarborName == null) ? 0 : enterHarborName.hashCode());
		result = prime * result + ((gradeArea == null) ? 0 : gradeArea.hashCode());
		result = prime * result + ((gradeCity == null) ? 0 : gradeCity.hashCode());
		result = prime * result + ((leaveHarborId == null) ? 0 : leaveHarborId.hashCode());
		result = prime * result + ((leaveHarborName == null) ? 0 : leaveHarborName.hashCode());
		result = prime * result + outsideNet;
		result = prime * result + ((portArea == null) ? 0 : portArea.hashCode());
		result = prime * result + ((province == null) ? 0 : province.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + ((serviceArea == null) ? 0 : serviceArea.hashCode());
		result = prime * result + ((specialZone == null) ? 0 : specialZone.hashCode());
		result = prime * result + suburbanCounty;
		result = prime * result + ((unServiceArea == null) ? 0 : unServiceArea.hashCode());
		result = prime * result + userable;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Area other = (Area) obj;
		if (areaId == null) {
			if (other.areaId != null)
				return false;
		} else if (!areaId.equals(other.areaId))
			return false;
		if (briefCode == null) {
			if (other.briefCode != null)
				return false;
		} else if (!briefCode.equals(other.briefCode))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (cityCode == null) {
			if (other.cityCode != null)
				return false;
		} else if (!cityCode.equals(other.cityCode))
			return false;
		if (codePost == null) {
			if (other.codePost != null)
				return false;
		} else if (!codePost.equals(other.codePost))
			return false;
		if (county == null) {
			if (other.county != null)
				return false;
		} else if (!county.equals(other.county))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (enterHarborId == null) {
			if (other.enterHarborId != null)
				return false;
		} else if (!enterHarborId.equals(other.enterHarborId))
			return false;
		if (enterHarborName == null) {
			if (other.enterHarborName != null)
				return false;
		} else if (!enterHarborName.equals(other.enterHarborName))
			return false;
		if (gradeArea == null) {
			if (other.gradeArea != null)
				return false;
		} else if (!gradeArea.equals(other.gradeArea))
			return false;
		if (gradeCity == null) {
			if (other.gradeCity != null)
				return false;
		} else if (!gradeCity.equals(other.gradeCity))
			return false;
		if (leaveHarborId == null) {
			if (other.leaveHarborId != null)
				return false;
		} else if (!leaveHarborId.equals(other.leaveHarborId))
			return false;
		if (leaveHarborName == null) {
			if (other.leaveHarborName != null)
				return false;
		} else if (!leaveHarborName.equals(other.leaveHarborName))
			return false;
		if (outsideNet != other.outsideNet)
			return false;
		if (portArea == null) {
			if (other.portArea != null)
				return false;
		} else if (!portArea.equals(other.portArea))
			return false;
		if (province == null) {
			if (other.province != null)
				return false;
		} else if (!province.equals(other.province))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (serviceArea == null) {
			if (other.serviceArea != null)
				return false;
		} else if (!serviceArea.equals(other.serviceArea))
			return false;
		if (specialZone == null) {
			if (other.specialZone != null)
				return false;
		} else if (!specialZone.equals(other.specialZone))
			return false;
		if (suburbanCounty != other.suburbanCounty)
			return false;
		if (unServiceArea == null) {
			if (other.unServiceArea != null)
				return false;
		} else if (!unServiceArea.equals(other.unServiceArea))
			return false;
		if (userable != other.userable)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Area [areaId=" + areaId + ", province=" + province + ", city=" + city + ", county=" + county
				+ ", codePost=" + codePost + ", briefCode=" + briefCode + ", cityCode=" + cityCode + ", enterHarborId="
				+ enterHarborId + ", enterHarborName=" + enterHarborName + ", leaveHarborId=" + leaveHarborId
				+ ", leaveHarborName=" + leaveHarborName + ", serviceArea=" + serviceArea + ", unServiceArea="
				+ unServiceArea + ", specialZone=" + specialZone + ", outsideNet=" + outsideNet + ", suburbanCounty="
				+ suburbanCounty + ", gradeArea=" + gradeArea + ", region=" + region + ", gradeCity=" + gradeCity
				+ ", portArea=" + portArea + ", userable=" + userable + ", description=" + description + "]";
	}

	

}
