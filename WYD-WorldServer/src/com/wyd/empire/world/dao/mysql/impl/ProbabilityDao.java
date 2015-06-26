package com.wyd.empire.world.dao.mysql.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wyd.db.dao.impl.UniversalDaoHibernate;
import com.wyd.empire.world.dao.mysql.IProbabilityDao;
import com.wyd.empire.world.entity.mysql.Probability;

/**
 * The DAO class for the TabConsortiaright entity.
 */
public class ProbabilityDao extends UniversalDaoHibernate implements IProbabilityDao {
	private Map<Integer, Integer> pMap = null;

	public ProbabilityDao() {
		super();
	}

	/**
	 * 初始化数据
	 */
	@SuppressWarnings("unchecked")
	public void initData() {
		if (pMap == null) {
			pMap = new HashMap<Integer, Integer>();
		} else {
			pMap.clear();
		}
		List<Probability> probabilityList = getList("FROM Probability ", new Object[]{});
		for (Probability p : probabilityList) {
			pMap.put(p.getId(), p.getWeights());
		}
	}

	public Map<Integer, Integer> getpMap() {
		return pMap;
	}
}