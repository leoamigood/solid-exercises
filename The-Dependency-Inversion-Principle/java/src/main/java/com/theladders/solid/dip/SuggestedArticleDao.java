package com.theladders.solid.dip;

import java.util.Collections;
import java.util.List;

public class SuggestedArticleDao
{
    public void updateByPrimaryKeySelective(@SuppressWarnings("unused") SuggestedArticle article) {}

    public int insertReturnId(@SuppressWarnings("unused") SuggestedArticle suggestedArticle)
    {
        return 0;
    }

    public List<SuggestedArticle> selectByExampleWithBlobs(@SuppressWarnings("unused") Integer subscriberId)
    {
        Criteria criteria = new SuggestedArticleCriteria();
        criteria.andSubscriberIdEqualTo(subscriberId);

        return Collections.singletonList(new SuggestedArticle());
    }
}
