package it.dsigno.liferay.sb.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import it.dsigno.liferay.sb.NoSuchLoggerException;
import it.dsigno.liferay.sb.model.Logger;
import it.dsigno.liferay.sb.model.impl.LoggerImpl;
import it.dsigno.liferay.sb.model.impl.LoggerModelImpl;
import it.dsigno.liferay.sb.service.persistence.LoggerPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the logger service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author @denissignoretto
 * @see LoggerPersistence
 * @see LoggerUtil
 * @generated
 */
public class LoggerPersistenceImpl extends BasePersistenceImpl<Logger>
    implements LoggerPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link LoggerUtil} to access the logger persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = LoggerImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LoggerModelImpl.ENTITY_CACHE_ENABLED,
            LoggerModelImpl.FINDER_CACHE_ENABLED, LoggerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LoggerModelImpl.ENTITY_CACHE_ENABLED,
            LoggerModelImpl.FINDER_CACHE_ENABLED, LoggerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LoggerModelImpl.ENTITY_CACHE_ENABLED,
            LoggerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_LOGGER = "SELECT logger FROM Logger logger";
    private static final String _SQL_COUNT_LOGGER = "SELECT COUNT(logger) FROM Logger logger";
    private static final String _ORDER_BY_ENTITY_ALIAS = "logger.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Logger exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(LoggerPersistenceImpl.class);
    private static Logger _nullLogger = new LoggerImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Logger> toCacheModel() {
                return _nullLoggerCacheModel;
            }
        };

    private static CacheModel<Logger> _nullLoggerCacheModel = new CacheModel<Logger>() {
            @Override
            public Logger toEntityModel() {
                return _nullLogger;
            }
        };

    public LoggerPersistenceImpl() {
        setModelClass(Logger.class);
    }

    /**
     * Caches the logger in the entity cache if it is enabled.
     *
     * @param logger the logger
     */
    @Override
    public void cacheResult(Logger logger) {
        EntityCacheUtil.putResult(LoggerModelImpl.ENTITY_CACHE_ENABLED,
            LoggerImpl.class, logger.getPrimaryKey(), logger);

        logger.resetOriginalValues();
    }

    /**
     * Caches the loggers in the entity cache if it is enabled.
     *
     * @param loggers the loggers
     */
    @Override
    public void cacheResult(List<Logger> loggers) {
        for (Logger logger : loggers) {
            if (EntityCacheUtil.getResult(
                        LoggerModelImpl.ENTITY_CACHE_ENABLED, LoggerImpl.class,
                        logger.getPrimaryKey()) == null) {
                cacheResult(logger);
            } else {
                logger.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all loggers.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(LoggerImpl.class.getName());
        }

        EntityCacheUtil.clearCache(LoggerImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the logger.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Logger logger) {
        EntityCacheUtil.removeResult(LoggerModelImpl.ENTITY_CACHE_ENABLED,
            LoggerImpl.class, logger.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Logger> loggers) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Logger logger : loggers) {
            EntityCacheUtil.removeResult(LoggerModelImpl.ENTITY_CACHE_ENABLED,
                LoggerImpl.class, logger.getPrimaryKey());
        }
    }

    /**
     * Creates a new logger with the primary key. Does not add the logger to the database.
     *
     * @param loggerId the primary key for the new logger
     * @return the new logger
     */
    @Override
    public Logger create(long loggerId) {
        Logger logger = new LoggerImpl();

        logger.setNew(true);
        logger.setPrimaryKey(loggerId);

        return logger;
    }

    /**
     * Removes the logger with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param loggerId the primary key of the logger
     * @return the logger that was removed
     * @throws it.dsigno.liferay.sb.NoSuchLoggerException if a logger with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Logger remove(long loggerId)
        throws NoSuchLoggerException, SystemException {
        return remove((Serializable) loggerId);
    }

    /**
     * Removes the logger with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the logger
     * @return the logger that was removed
     * @throws it.dsigno.liferay.sb.NoSuchLoggerException if a logger with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Logger remove(Serializable primaryKey)
        throws NoSuchLoggerException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Logger logger = (Logger) session.get(LoggerImpl.class, primaryKey);

            if (logger == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchLoggerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(logger);
        } catch (NoSuchLoggerException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Logger removeImpl(Logger logger) throws SystemException {
        logger = toUnwrappedModel(logger);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(logger)) {
                logger = (Logger) session.get(LoggerImpl.class,
                        logger.getPrimaryKeyObj());
            }

            if (logger != null) {
                session.delete(logger);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (logger != null) {
            clearCache(logger);
        }

        return logger;
    }

    @Override
    public Logger updateImpl(it.dsigno.liferay.sb.model.Logger logger)
        throws SystemException {
        logger = toUnwrappedModel(logger);

        boolean isNew = logger.isNew();

        Session session = null;

        try {
            session = openSession();

            if (logger.isNew()) {
                session.save(logger);

                logger.setNew(false);
            } else {
                session.merge(logger);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(LoggerModelImpl.ENTITY_CACHE_ENABLED,
            LoggerImpl.class, logger.getPrimaryKey(), logger);

        return logger;
    }

    protected Logger toUnwrappedModel(Logger logger) {
        if (logger instanceof LoggerImpl) {
            return logger;
        }

        LoggerImpl loggerImpl = new LoggerImpl();

        loggerImpl.setNew(logger.isNew());
        loggerImpl.setPrimaryKey(logger.getPrimaryKey());

        loggerImpl.setLoggerId(logger.getLoggerId());
        loggerImpl.setGroupId(logger.getGroupId());
        loggerImpl.setCompanyId(logger.getCompanyId());
        loggerImpl.setUserId(logger.getUserId());
        loggerImpl.setUserName(logger.getUserName());
        loggerImpl.setCreateDate(logger.getCreateDate());
        loggerImpl.setModifiedDate(logger.getModifiedDate());
        loggerImpl.setLogMessage(logger.getLogMessage());

        return loggerImpl;
    }

    /**
     * Returns the logger with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the logger
     * @return the logger
     * @throws it.dsigno.liferay.sb.NoSuchLoggerException if a logger with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Logger findByPrimaryKey(Serializable primaryKey)
        throws NoSuchLoggerException, SystemException {
        Logger logger = fetchByPrimaryKey(primaryKey);

        if (logger == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchLoggerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return logger;
    }

    /**
     * Returns the logger with the primary key or throws a {@link it.dsigno.liferay.sb.NoSuchLoggerException} if it could not be found.
     *
     * @param loggerId the primary key of the logger
     * @return the logger
     * @throws it.dsigno.liferay.sb.NoSuchLoggerException if a logger with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Logger findByPrimaryKey(long loggerId)
        throws NoSuchLoggerException, SystemException {
        return findByPrimaryKey((Serializable) loggerId);
    }

    /**
     * Returns the logger with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the logger
     * @return the logger, or <code>null</code> if a logger with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Logger fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Logger logger = (Logger) EntityCacheUtil.getResult(LoggerModelImpl.ENTITY_CACHE_ENABLED,
                LoggerImpl.class, primaryKey);

        if (logger == _nullLogger) {
            return null;
        }

        if (logger == null) {
            Session session = null;

            try {
                session = openSession();

                logger = (Logger) session.get(LoggerImpl.class, primaryKey);

                if (logger != null) {
                    cacheResult(logger);
                } else {
                    EntityCacheUtil.putResult(LoggerModelImpl.ENTITY_CACHE_ENABLED,
                        LoggerImpl.class, primaryKey, _nullLogger);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(LoggerModelImpl.ENTITY_CACHE_ENABLED,
                    LoggerImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return logger;
    }

    /**
     * Returns the logger with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param loggerId the primary key of the logger
     * @return the logger, or <code>null</code> if a logger with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Logger fetchByPrimaryKey(long loggerId) throws SystemException {
        return fetchByPrimaryKey((Serializable) loggerId);
    }

    /**
     * Returns all the loggers.
     *
     * @return the loggers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Logger> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the loggers.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.dsigno.liferay.sb.model.impl.LoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of loggers
     * @param end the upper bound of the range of loggers (not inclusive)
     * @return the range of loggers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Logger> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the loggers.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.dsigno.liferay.sb.model.impl.LoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of loggers
     * @param end the upper bound of the range of loggers (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of loggers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Logger> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Logger> list = (List<Logger>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_LOGGER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_LOGGER;

                if (pagination) {
                    sql = sql.concat(LoggerModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Logger>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Logger>(list);
                } else {
                    list = (List<Logger>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the loggers from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Logger logger : findAll()) {
            remove(logger);
        }
    }

    /**
     * Returns the number of loggers.
     *
     * @return the number of loggers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_LOGGER);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the logger persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.it.dsigno.liferay.sb.model.Logger")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Logger>> listenersList = new ArrayList<ModelListener<Logger>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Logger>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(LoggerImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
