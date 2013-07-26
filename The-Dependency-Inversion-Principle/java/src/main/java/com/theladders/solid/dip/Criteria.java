package com.theladders.solid.dip;

import java.util.List;

/**
 * User: Leo Amigood <lamigud@theladders.com>
 * Date: 7/26/13
 * Time: 10:44 AM
 */
public interface Criteria
{
    public Criteria andSubscriberIdEqualTo(Integer value);
    public Criteria andSuggestedArticleSourceIdEqualTo(Integer value);
    public Criteria andSuggestedArticleStatusIdIn(List<Integer> values);

    public void or(Criteria criteria);
    public List<Criteria> getOredCriteria();
}
