package com.theladders.solid.dip;

import java.util.*;

/**
 * User: Leo Amigood <lamigud@theladders.com>
 * Date: 7/26/13
 * Time: 11:00 AM
 */
public class SuggestedArticleCriteria extends OrderedCriteria {
    private List<Map<String, Object>> criteriaWithSingleValue = new ArrayList<>();
    private List<Map<String, Object>> criteriaWithListValue = new ArrayList<>();

    public SuggestedArticleCriteria() {
        andSuggestedArticleStatusIdIn(Arrays.asList(1, 2));
        andSuggestedArticleSourceIdEqualTo(1);
        setOrderByClause("create_time desc");
    }

    protected void addCriterion(String condition, Object value, String property) {
        if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
        }
        Map<String, Object> map = new HashMap<>();
        map.put("condition", condition);
        map.put("value", value);
        criteriaWithSingleValue.add(map);
    }

    protected void addCriterion(String condition, List<? extends Object> values, String property) {
        if (values == null || values.size() == 0) {
            throw new RuntimeException("Value list for " + property + " cannot be null or empty");
        }
        Map<String, Object> map = new HashMap<>();
        map.put("condition", condition);
        map.put("values", values);
        criteriaWithListValue.add(map);
    }

    public Criteria andSubscriberIdEqualTo(Integer value) {
        addCriterion("subscriber_id =", value, "subscriberId");
        return (Criteria) this;
    }

    public Criteria andSuggestedArticleSourceIdEqualTo(Integer value) {
        addCriterion("suggested_article_source_id =", value, "suggestedArticleSourceId");
        return (Criteria) this;
    }

    public Criteria andSuggestedArticleStatusIdIn(List<Integer> values) {
        addCriterion("suggested_article_status_id in", values, "suggestedArticleStatusId");
        return (Criteria) this;
    }
}
