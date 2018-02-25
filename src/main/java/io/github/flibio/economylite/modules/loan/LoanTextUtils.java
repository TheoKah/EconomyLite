/*
 * This file is part of EconomyLite, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2015 - 2018 Flibio
 * Copyright (c) Contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package io.github.flibio.economylite.modules.loan;

import org.spongepowered.api.text.action.TextActions;

import org.spongepowered.api.text.format.TextColors;
import org.spongepowered.api.text.Text;

public class LoanTextUtils {

    public static Text yesOrNo(String yes, String no) {
        Text accept =
                Text.of(TextColors.DARK_GRAY, "[", TextColors.GREEN, "YES", TextColors.DARK_GRAY, "]").toBuilder()
                        .onHover(TextActions.showText(Text.of(TextColors.GREEN, "Yes!")))
                        .onClick(TextActions.runCommand(yes))
                        .build();
        Text deny =
                Text.of(TextColors.DARK_GRAY, "[", TextColors.RED, "NO", TextColors.DARK_GRAY, "]").toBuilder()
                        .onHover(TextActions.showText(Text.of(TextColors.RED, "No!")))
                        .onClick(TextActions.runCommand(no))
                        .build();
        return accept.toBuilder().append(Text.of(" "), deny).build();
    }
}