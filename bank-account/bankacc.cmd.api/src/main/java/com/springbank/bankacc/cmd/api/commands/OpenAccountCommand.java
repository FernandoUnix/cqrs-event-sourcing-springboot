package com.springbank.bankacc.cmd.api.commands;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;
import com.springbank.bankacc.core.models.AccountType;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@Builder
public class OpenAccountCommand {
    @TargetAggregateIdentifier
    private String id;

    @NotNull(message = "no account holder ID was supplied.")
    private String accountHolderId;

    @NotNull(message = "no account type was supplied.")
    private AccountType accountType;

    @Min(value = 50, message = "opening balance must be at least 50.")
    private double openingBalance;
}
