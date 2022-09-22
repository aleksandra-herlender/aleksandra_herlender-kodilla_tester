package com.kodilla.mockito.homework;

import com.kodilla.notification.Notification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherServiceTest {

    WeatherService service = new WeatherService();
    Localization localization1 = Mockito.mock(Localization.class);
    Localization localization2 = Mockito.mock(Localization.class);
    User user = Mockito.mock(User.class);
    User user2 = Mockito.mock(User.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void subscribedUserShouldReceivedNotification(){
        service.subscribe(user,localization1);
        service.sendNotification(notification);
        Mockito.verify(user).receiveNotification(notification);
    }

    @Test
    public void userIsAbleToUnsubscribeFromLocalization(){
        service.subscribe(user,localization1);
        service.removeSubscriptionFromLocalization(user,localization1);
        service.sendNotificationForLocalization(localization1, notification);
        Mockito.verify(user,Mockito.never()).receiveNotification(notification);
    }

    @Test
    public void userIsAbleToUnsubscribeFromAllLocalizations(){
        service.subscribe(user,localization1);
        service.subscribe(user, localization2);
        service.removeSubscription(user);
        service.sendNotification(notification);
        Mockito.verify(user,Mockito.never()).receiveNotification(notification);
    }

    @Test
    public void notificationForGivenLocalizationShouldBeReceivedOnlyInItsGroup(){
        service.subscribe(user,localization1);
        service.subscribe(user2, localization2);
        service.sendNotificationForLocalization(localization1, notification);
        Mockito.verify(user).receiveNotification(notification);
        Mockito.verify(user2, Mockito.never()).receiveNotification(notification);
    }

    @Test
    public void allUsersShouldReceivedNotification(){
        service.subscribe(user,localization1);
        service.subscribe(user2, localization2);
        service.sendNotification(notification);
        Mockito.verify(user).receiveNotification(notification);
        Mockito.verify(user2).receiveNotification(notification);
    }

    @Test
    public void localizationCanBeDeleted(){
        service.subscribe(user,localization1);
        service.subscribe(user2, localization2);
        service.removeLocalization(localization1);
        service.sendNotificationForLocalization(localization1,notification);
        Mockito.verify(user, Mockito.never()).receiveNotification(notification);
        Mockito.verify(user, Mockito.never()).receiveNotification(notification);
    }

}