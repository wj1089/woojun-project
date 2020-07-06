package com.parkk.web.Gym;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

public class GymRepositoryImpl extends QuerydslRepositorySupport implements GymRepositoryCustom {

    public GymRepositoryImpl(){super(Gym.class);}

    @Override
    public List<Gym> list(String searchWord) {
        QGym gym = QGym.gym;
        JPAQueryFactory query = new JPAQueryFactory(this.getEntityManager());
        return query.select(Projections.fields(Gym.class,gym.gymNo,gym.open_YN,gym.number,
                gym.address,gym.mailing_address,gym.name)).from(gym).where(gym.name.like("%" + searchWord + "%")).fetch();
    }
}
