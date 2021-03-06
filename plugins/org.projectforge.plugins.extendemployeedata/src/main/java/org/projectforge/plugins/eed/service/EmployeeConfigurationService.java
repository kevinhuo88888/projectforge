package org.projectforge.plugins.eed.service;

import org.projectforge.framework.persistence.api.IDao;
import org.projectforge.framework.persistence.api.IPersistenceService;
import org.projectforge.plugins.eed.model.EmployeeConfigurationDO;
import org.projectforge.plugins.eed.model.EmployeeConfigurationTimedDO;

public interface EmployeeConfigurationService
    extends IPersistenceService<EmployeeConfigurationDO>, IDao<EmployeeConfigurationDO>
{
  EmployeeConfigurationTimedDO addNewTimeAttributeRow(final EmployeeConfigurationDO employeeConfiguration,
      final String groupName);

  Integer getSingleEmployeeConfigurationDOId();

  EmployeeConfigurationDO getSingleEmployeeConfigurationDO();
}
