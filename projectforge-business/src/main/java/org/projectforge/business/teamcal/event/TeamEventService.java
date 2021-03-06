package org.projectforge.business.teamcal.event;

import java.util.List;
import java.util.Set;

import org.projectforge.business.teamcal.event.model.TeamEventAttendeeDO;
import org.projectforge.business.teamcal.event.model.TeamEventDO;

public interface TeamEventService
{
  List<Integer> getAssignedAttendeeIds(TeamEventDO data);

  List<TeamEventAttendeeDO> getAddressesAndUserAsAttendee();

  TeamEventAttendeeDO getAttendee(Integer attendeeId);

  void assignAttendees(TeamEventDO data, Set<TeamEventAttendeeDO> itemsToAssign,
      Set<TeamEventAttendeeDO> itemsToUnassign);

  boolean sendTeamEventToAttendees(TeamEventDO data, boolean isNew, boolean hasChanges, boolean isDeleted,
      Set<TeamEventAttendeeDO> addedAttendees);

  TeamEventDO findByUid(String reqEventUid);

  TeamEventAttendeeDO findByAttendeeId(Integer attendeeId, boolean checkAccess);

  TeamEventAttendeeDO findByAttendeeId(Integer attendeeId);

  void update(TeamEventDO event);

  void update(TeamEventDO event, boolean checkAccess);
}
