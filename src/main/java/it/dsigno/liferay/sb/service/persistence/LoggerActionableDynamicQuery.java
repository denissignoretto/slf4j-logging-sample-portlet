package it.dsigno.liferay.sb.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import it.dsigno.liferay.sb.model.Logger;
import it.dsigno.liferay.sb.service.LoggerLocalServiceUtil;

/**
 * @author @denissignoretto
 * @generated
 */
public abstract class LoggerActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public LoggerActionableDynamicQuery() throws SystemException {
        setBaseLocalService(LoggerLocalServiceUtil.getService());
        setClass(Logger.class);

        setClassLoader(it.dsigno.liferay.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("loggerId");
    }
}
