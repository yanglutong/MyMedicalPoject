package com.yang.mymedicalpoject.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.yang.mymedicalpoject.bean.CollectBean;
import com.yang.mymedicalpoject.bean.ThreeBean;

import com.yang.mymedicalpoject.db.CollectBeanDao;
import com.yang.mymedicalpoject.db.ThreeBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig collectBeanDaoConfig;
    private final DaoConfig threeBeanDaoConfig;

    private final CollectBeanDao collectBeanDao;
    private final ThreeBeanDao threeBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        collectBeanDaoConfig = daoConfigMap.get(CollectBeanDao.class).clone();
        collectBeanDaoConfig.initIdentityScope(type);

        threeBeanDaoConfig = daoConfigMap.get(ThreeBeanDao.class).clone();
        threeBeanDaoConfig.initIdentityScope(type);

        collectBeanDao = new CollectBeanDao(collectBeanDaoConfig, this);
        threeBeanDao = new ThreeBeanDao(threeBeanDaoConfig, this);

        registerDao(CollectBean.class, collectBeanDao);
        registerDao(ThreeBean.class, threeBeanDao);
    }
    
    public void clear() {
        collectBeanDaoConfig.clearIdentityScope();
        threeBeanDaoConfig.clearIdentityScope();
    }

    public CollectBeanDao getCollectBeanDao() {
        return collectBeanDao;
    }

    public ThreeBeanDao getThreeBeanDao() {
        return threeBeanDao;
    }

}
