import java.util.List;

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao() {
                @Override
                public List<Ad> all() {
                    return null;
                }

                @Override
                public Long insert(Ad ad) {
                    return null;
                }
            };
        }
        return adsDao;
    }
}
