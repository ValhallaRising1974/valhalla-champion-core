// HammerheartCharacter.h
#pragma once

#include "CoreMinimal.h"
#include "GameFramework/Character.h"
#include "HammerheartCharacter.generated.h"

UCLASS()
class AHammerheartCharacter : public ACharacter
{
    GENERATED_BODY()

public:
    AHammerheartCharacter();

protected:
    virtual void BeginPlay() override;

public:
    virtual void Tick(float DeltaTime) override;

    void UseHammerStrike();
    void ActivateDreadnought();
    void UseBlastHammer();
    void ExecuteUltimate();
    
private:
    float Stamina;
    bool bIsInvulnerable;
};
