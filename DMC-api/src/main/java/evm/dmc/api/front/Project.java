package evm.dmc.api.front;

import java.util.List;
import java.util.Properties;

public class Project {
	String name;
	List<Algorithm> algorithm;
	Properties projectProperties;
	
	public Project() {
		super();
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the algorithm
	 */
	public List<Algorithm> getAlgorithm() {
		return algorithm;
	}

	/**
	 * @param algorithm the algorithm to set
	 */
	public void setAlgorithm(List<Algorithm> algorithm) {
		this.algorithm = algorithm;
	}

	/**
	 * @return the projectProperties
	 */
	public Properties getProjectProperties() {
		return projectProperties;
	}

	/**
	 * @param projectProperties the projectProperties to set
	 */
	public void setProjectProperties(Properties projectProperties) {
		this.projectProperties = projectProperties;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((algorithm == null) ? 0 : algorithm.hashCode());
		result = prime * result + ((projectProperties == null) ? 0 : projectProperties.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		if (algorithm == null) {
			if (other.algorithm != null)
				return false;
		} else if (!algorithm.equals(other.algorithm))
			return false;
		if (projectProperties == null) {
			if (other.projectProperties != null)
				return false;
		} else if (!projectProperties.equals(other.projectProperties))
			return false;
		return true;
	}

}