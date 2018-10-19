/*
 * This file is part of Titanium
 * Copyright (C) 2018, Horizon Studio <contact@hrznstudio.com>, All rights reserved.
 *
 * This means no, you cannot steal this code. This is licensed for sole use by Horizon Studio and its subsidiaries, you MUST be granted specific written permission by Horizon Studio to use this code, thinking you have permission IS NOT PERMISSION!
 */
package com.hrznstudio.titanium.api.client;

import com.hrznstudio.titanium.api.client.assets.types.IBackgroundAsset;
import com.hrznstudio.titanium.client.gui.asset.IAssetProvider;

public class AssetTypes {
    public static final IAssetType<IBackgroundAsset> BACKGROUND = new GenericAssetType<>(() -> IAssetProvider.DEFAULT_PROVIDER.getAsset(AssetTypes.BACKGROUND), IBackgroundAsset.class);
    public static final IAssetType<IAsset> SLOT = new GenericAssetType<>(() -> IAssetProvider.DEFAULT_PROVIDER.getAsset(AssetTypes.SLOT), IAsset.class);
    public static final IAssetType<IAsset> ENERGY_BAR = new GenericAssetType<>(() -> IAssetProvider.DEFAULT_PROVIDER.getAsset(AssetTypes.ENERGY_BAR), IAsset.class);
    public static final IAssetType<IAsset> ENERGY_BACKGROUND = new GenericAssetType<>(() -> IAssetProvider.DEFAULT_PROVIDER.getAsset(AssetTypes.ENERGY_BACKGROUND), IAsset.class);
    public static final IAssetType<IAsset> TANK = new GenericAssetType<>(() -> IAssetProvider.DEFAULT_PROVIDER.getAsset(AssetTypes.TANK), IAsset.class);
    public static final IAssetType<IAsset> PROGRESS_BAR = new GenericAssetType<>(() -> IAssetProvider.DEFAULT_PROVIDER.getAsset(AssetTypes.PROGRESS_BAR), IAsset.class);
    public static final IAssetType<IAsset> PROGRESS_FILL = new GenericAssetType<>(() -> IAssetProvider.DEFAULT_PROVIDER.getAsset(AssetTypes.PROGRESS_FILL), IAsset.class);
}