import { createStackNavigator } from 'react-navigation-stack';
import { createAppContainer } from 'react-navigation';

import React from 'react';
import IndexScreen from './src/screens/IndexScreen';
import ShowScreen from './src/screens/ShowScreen';
import CreateScreen from './src/screens/CreateScreen';
import EditScreen from './src/screens/EditScreen';

import { Provider } from "./src/context/BlogContext";
import { Provider as CoreProvider } from "./src/context/CoreContext";
import { Provider as ArmProvider } from "./src/context/ArmContext";
import { Provider as LegsProvider } from "./src/context/LegsContext";
import { Provider as BackProvider } from "./src/context/BackContext";
import { Provider as ChestProvider } from "./src/context/ChestContext";


import BarcodeScreen from './src/screens/BarcodeScreen';

import BodyPartList from './src/screens/BodyPartList';
import Core from './src/screens/Core';
import Arm from './src/screens/Arm';
import Legs from './src/screens/Legs';
import Back from './src/screens/Back';
import Chest from './src/screens/Chest';

import InnerCore from './src/screens/InnerCore';
import InnerArm from './src/screens/InnerArm';
import InnerLegs from './src/screens/InnerLegs';
import InnerBack from './src/screens/InnerBack';
import InnerChest from './src/screens/InnerChest';


const navigator = createStackNavigator({
  Index: IndexScreen,
  Show: ShowScreen,
  Create: CreateScreen,
  Edit: EditScreen,
  Barcode: BarcodeScreen,

  Exercise: BodyPartList,
  Core: Core,
  Arm: Arm,
  Legs: Legs,
  Back: Back,
  Chest: Chest,

  InnerCore: InnerCore,
  InnerArm: InnerArm,
  InnerLegs: InnerLegs,
  InnerBack: InnerBack,
  InnerChest: InnerChest,
},
// All credits for photos go to fitnessprogrammer.com and descriptions from various sources, verywellfit.com

{
  initialRouteName: "Index",
  defaultNavigationOptions: {
      title : "Fitness App"
  }

});


const App = createAppContainer(navigator);

export default () => {
  return <Provider>
    <ArmProvider>
      <LegsProvider>
        <CoreProvider>
          <BackProvider>
            <ChestProvider>
            <App />
            </ChestProvider>
          </BackProvider>
        </CoreProvider>
      </LegsProvider>
    </ArmProvider>
  </Provider>
}