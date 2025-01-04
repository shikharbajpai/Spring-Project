package org.springLifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Sports implements InitializingBean, DisposableBean {
    private int sports_id;
    private String sport_name;

    public Sports() {
    }

    public Sports(int sports_id, String sport_name) {
        this.sports_id = sports_id;
        this.sport_name = sport_name;
    }

    public int getSports_id() {
        return sports_id;
    }

    public void setSports_id(int sports_id) {
        this.sports_id = sports_id;
    }

    public String getSport_name() {
        return sport_name;
    }

    public void setSport_name(String sport_name) {
        this.sport_name = sport_name;
    }


    @Override
    public String toString() {
        return "Sports{" +
                "sports_id=" + sports_id +
                ", sport_name='" + sport_name + '\'' +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        /*System.out.println("Sports Class init method is called");*/
    }

    @Override
    public void destroy() throws Exception {
        /*System.out.println("Sports Class destroy method is called");*/
    }
}
