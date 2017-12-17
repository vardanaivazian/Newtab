package net.newtab.dao;

import net.newtab.model.Website;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vardan on 12/17/2017.
 */

@Component
public class WebsiteDAO {

    // Dummy database. Initialize with some dummy values.
    private static List<Website> websites;
    {
        websites = new ArrayList<Website>();
        websites.add(new Website(11L, "Kayqer.am", "Armenian Sites directory", "http://kayqer.am"));
        websites.add(new Website(13L, "News.am", "Armenian New Portal", "https://news.am"));
        websites.add(new Website(17L, "List.am", "Armenian Classified ads portal", "https://list.am"));
        websites.add(new Website(23L, "CareerCenter.am", "Armenian Job portal", "https://careercenter.am"));
    }


    /**
     * Returns list of websites from dummy database.
     *
     * @return list of wensites
     */
    public List<Website> list() {
        return websites;
    }

    /**
     * Return website object for given id from dummy database. If website is
     * not found for id, returns null.
     *
     * @param id website id
     * @return website object for given id
     */
    public Website get(Long id) {

        for (Website w : websites) {
            if (w.getId().equals(id)) {
                return w;
            }
        }
        return null;
    }


    /**
     * Create new website in dummy database. Updates the id and insert new
     * website in list.
     *
     * @param website Website object
     * @return website object with updated id
     */
    public Website create(Website website) {
        website.setId(System.currentTimeMillis());
        websites.add(website);
        return website;
    }


    /**
     * Delete the website object from dummy database. If website not found for
     * given id, returns null.
     *
     * @param id the website id
     * @return id of deleted website object
     */
    public Long delete(Long id) {

        for (Website w : websites) {
            if (w.getId().equals(id)) {
                websites.remove(w);
                return id;
            }
        }

        return null;
    }


    /**
     * Update the website object for given id in dummy database. If website
     * not exists, returns null
     *
     * @param id the website id
     * @param website is Website object
     * @return website object with id
     */
    public Website update(Long id, Website website) {

        for (Website w : websites) {
            if (w.getId().equals(id)) {
                website.setId(w.getId());
                websites.remove(w);
                websites.add(website);
                return website;
            }
        }

        return null;
    }



}
