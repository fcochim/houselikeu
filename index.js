import { Navigation } from 'react-native-navigation';


import Maps from './screens/Maps';
import Aplications from './screens/Aplications';
import Home from './screens/Home';
import Profile from './screens/Profile';

// register all screens of the app (including internal ones)
export function registerScreens() {
  Navigation.registerComponent('houselike.Maps', () => Maps);
  Navigation.registerComponent('houselike.Aplications', () => Aplications);
  Navigation.registerComponent('houselike.Home', () => Home);
  Navigation.registerComponent('houselike.Profile', () => Profile);
}

registerScreens(); // this is where you register all of your app's screens

// start the app
Navigation.startTabBasedApp({
  tabs: [
    {
      label: 'One',
      screen: 'houselike.Maps', // this is a registered name for a screen
      icon: require('./assets/approval.png'),
      selectedIcon: require('./assets/approval.png'), // iOS only
      title: 'Screen One'
    },
    {
      label: 'Two',
      screen: 'houselike.Aplications',
      icon: require('./assets/airdrop.png'),
      selectedIcon: require('./assets/airdrop.png'), // iOS only
      title: 'Screen Two'
    },
    {
      label: 'Two',
      screen: 'houselike.Home',
      icon: require('./assets/airplane.png'),
      selectedIcon: require('./assets/airplane.png'), // iOS only
      title: 'Screen Two'
    },
    {
      label: 'Two',
      screen: 'houselike.Profile',
      icon: require('./assets/apple.png'),
      selectedIcon: require('./assets/apple.png'), // iOS only
      title: 'Screen Two'
    }
  ]
});
