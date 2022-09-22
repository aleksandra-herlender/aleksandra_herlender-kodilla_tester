package com.kodilla.mockito.homework;

import com.kodilla.notification.Notification;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherService {

    private final Map<Localization, Set<User>> subscribers = new HashMap<>();

    public void sendNotificationForLocalization(Localization localization, Notification notification){
        this.subscribers.getOrDefault(localization,new HashSet<>()).forEach(user -> user.receiveNotification(notification));
    }

    public void sendNotification(Notification notification){
            for (Map.Entry<Localization,Set<User>> entry: this.subscribers.entrySet()){
                entry.getValue().forEach(user -> user.receiveNotification(notification));
            }
    }

    public void subscribe(User user, Localization localization){
        if(!this.subscribers.containsKey(localization))
        {
            this.subscribers.put(localization,new HashSet<>());
        }
        this.subscribers.get(localization).add(user);

    }

    public void removeSubscriptionFromLocalization(User user, Localization localization){
        if(!this.subscribers.containsKey(localization))
        {
            this.subscribers.put(localization,new HashSet<>());
        }
        this.subscribers.get(localization).remove(user);

    }

    public void removeSubscription(User user){
        for (Map.Entry<Localization,Set<User>> entry:this.subscribers.entrySet()) {
            entry.getValue().remove(user);
        }
    }

    public void removeLocalization(Localization localization){
        this.subscribers.remove(localization);
    }

}
